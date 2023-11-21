/*
 * generated by Xtext 2.32.0
 */
package persons.tasks.validation

import org.eclipse.xtext.validation.Check
import persons.tasks.taskDSL.Planning
import persons.tasks.taskDSL.Task
import persons.tasks.taskDSL.TimeUnit

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class TaskDSLValidator extends AbstractTaskDSLValidator {
	
	@Check
	def checkTimeUnit(Task task) {
		if (task.duration !== null){
			switch(task.duration.unit){
				case TimeUnit::MINUTE: 
					if (task.duration.dl > 1000){
						warning("Rewrite to other unit",null)
					}
				case TimeUnit::HOUR: null
				case TimeUnit::DAY: 
					if (task.duration.dl > 150){
						info("Maybe rewrite to weeks",null)
					}
				case TimeUnit::WEEK:
					if (task.duration.dl > 52){
						error("Deadline longer than 1 year not allowed",null)
					}
					
				}
		}
	}

	@Check
	def checkDoublePersons(Planning planning){
		var plist = planning.persons // lists start at position 0
		for (var i= 0; i < plist.size ; i++){
			for (var j = i+1; j < plist.size ; j++){
				if (plist.get(i).name.equals(plist.get(j).name)) {
					error("Double name",null)
					}
				}
			}
		}
		
}
