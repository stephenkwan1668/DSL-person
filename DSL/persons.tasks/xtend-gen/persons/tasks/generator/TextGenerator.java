package persons.tasks.generator;

import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import persons.tasks.taskDSL.Action;
import persons.tasks.taskDSL.Balance;
import persons.tasks.taskDSL.BinaryBooleanOperator;
import persons.tasks.taskDSL.BooleanExpression;
import persons.tasks.taskDSL.BooleanExpressionBracket;
import persons.tasks.taskDSL.BooleanExpressionConstant;
import persons.tasks.taskDSL.CompareOperator;
import persons.tasks.taskDSL.Duration;
import persons.tasks.taskDSL.ExpressionAddition;
import persons.tasks.taskDSL.ExpressionBalance;
import persons.tasks.taskDSL.ExpressionBinOp;
import persons.tasks.taskDSL.ExpressionBracket;
import persons.tasks.taskDSL.ExpressionCompOp;
import persons.tasks.taskDSL.ExpressionConstantInt;
import persons.tasks.taskDSL.ExpressionDivision;
import persons.tasks.taskDSL.ExpressionMaximum;
import persons.tasks.taskDSL.ExpressionMinimum;
import persons.tasks.taskDSL.ExpressionMinus;
import persons.tasks.taskDSL.ExpressionModulo;
import persons.tasks.taskDSL.ExpressionMultiply;
import persons.tasks.taskDSL.ExpressionPlus;
import persons.tasks.taskDSL.ExpressionPower;
import persons.tasks.taskDSL.ExpressionSubtraction;
import persons.tasks.taskDSL.LunchAction;
import persons.tasks.taskDSL.MeetingAction;
import persons.tasks.taskDSL.NotExpression;
import persons.tasks.taskDSL.PaperAction;
import persons.tasks.taskDSL.PaymentAction;
import persons.tasks.taskDSL.Person;
import persons.tasks.taskDSL.Planning;
import persons.tasks.taskDSL.Task;
import persons.tasks.taskDSL.TimeUnit;

@SuppressWarnings("all")
public class TextGenerator {
  public static CharSequence toText(final Planning root) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Info of the planning ");
    String _name = root.getName();
    _builder.append(_name);
    _builder.newLineIfNotEmpty();
    _builder.append("All Persons:");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("14");
    _builder.newLine();
    {
      EList<Person> _persons = root.getPersons();
      for(final Person p : _persons) {
        _builder.append("\t");
        String _name_1 = p.getName();
        _builder.append(_name_1);
        _builder.append("\n");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("All actions of tasks:");
    _builder.newLine();
    {
      EList<Task> _tasks = root.getTasks();
      boolean _hasElements = false;
      for(final Task t : _tasks) {
        if (!_hasElements) {
          _hasElements = true;
          _builder.append("====== \n");
        } else {
          _builder.appendImmediate(" &", "");
        }
        CharSequence _action2Text = TextGenerator.action2Text(t.getAction());
        _builder.append(_action2Text);
        CharSequence _infoAction = TextGenerator.infoAction(t);
        _builder.append(_infoAction);
        _builder.newLineIfNotEmpty();
      }
      if (_hasElements) {
        _builder.append("=====");
      }
    }
    _builder.append("Other way of listing all tasks:");
    _builder.newLine();
    {
      List<Action> _actions = Auxiliary.getActions(root);
      boolean _hasElements_1 = false;
      for(final Action a : _actions) {
        if (!_hasElements_1) {
          _hasElements_1 = true;
        } else {
          _builder.appendImmediate(" , ", "");
        }
        CharSequence _action2Text_1 = TextGenerator.action2Text(a);
        _builder.append(_action2Text_1);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }

  protected static CharSequence _action2Text(final LunchAction action) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Lunch at location ");
    String _location = action.getLocation();
    _builder.append(_location);
    return _builder;
  }

  protected static CharSequence _action2Text(final MeetingAction action) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Meeting with topic ");
    String _topic = action.getTopic();
    _builder.append(_topic);
    return _builder;
  }

  protected static CharSequence _action2Text(final PaperAction action) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Paper for journal ");
    String _report = action.getReport();
    _builder.append(_report);
    return _builder;
  }

  protected static CharSequence _action2Text(final PaymentAction action) {
    StringConcatenation _builder = new StringConcatenation();
    {
      BooleanExpression _condition = action.getCondition();
      boolean _tripleNotEquals = (_condition != null);
      if (_tripleNotEquals) {
        _builder.append("if ");
        CharSequence _generateExpression = TextGenerator.generateExpression(action.getCondition());
        _builder.append(_generateExpression);
        _builder.newLineIfNotEmpty();
        _builder.append("then ");
      }
    }
    _builder.append("Pay ");
    CharSequence _generateExpression_1 = TextGenerator.generateExpression(action.getAmount());
    _builder.append(_generateExpression_1);
    _builder.append(" euro");
    return _builder;
  }

  public static CharSequence infoAction(final Task t) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Duration _duration = t.getDuration();
      boolean _tripleNotEquals = (_duration != null);
      if (_tripleNotEquals) {
        _builder.append(" with duration: ");
        int _dl = t.getDuration().getDl();
        _builder.append(_dl);
        _builder.newLineIfNotEmpty();
        CharSequence _text = TextGenerator.toText(t.getDuration().getUnit());
        _builder.append(_text);
      }
    }
    return _builder;
  }

  public static CharSequence toText(final TimeUnit u) {
    if (u != null) {
      switch (u) {
        case MINUTE:
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("m");
          return _builder;
        case HOUR:
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("h");
          return _builder_1;
        case DAY:
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("d");
          return _builder_2;
        case WEEK:
          StringConcatenation _builder_3 = new StringConcatenation();
          _builder_3.append("w");
          return _builder_3;
        default:
          break;
      }
    }
    return null;
  }

  protected static CharSequence _generateExpression(final ExpressionAddition expr) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    CharSequence _generateExpression = TextGenerator.generateExpression(expr.getLeft());
    _builder.append(_generateExpression);
    _builder.append(" + ");
    CharSequence _generateExpression_1 = TextGenerator.generateExpression(expr.getRight());
    _builder.append(_generateExpression_1);
    _builder.append(")");
    return _builder;
  }

  protected static CharSequence _generateExpression(final ExpressionSubtraction expr) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    CharSequence _generateExpression = TextGenerator.generateExpression(expr.getLeft());
    _builder.append(_generateExpression);
    _builder.append(" - ");
    CharSequence _generateExpression_1 = TextGenerator.generateExpression(expr.getRight());
    _builder.append(_generateExpression_1);
    _builder.append(")");
    return _builder;
  }

  protected static CharSequence _generateExpression(final ExpressionMultiply expr) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    CharSequence _generateExpression = TextGenerator.generateExpression(expr.getLeft());
    _builder.append(_generateExpression);
    _builder.append(" * ");
    CharSequence _generateExpression_1 = TextGenerator.generateExpression(expr.getRight());
    _builder.append(_generateExpression_1);
    _builder.append(")");
    return _builder;
  }

  protected static CharSequence _generateExpression(final ExpressionDivision expr) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    CharSequence _generateExpression = TextGenerator.generateExpression(expr.getLeft());
    _builder.append(_generateExpression);
    _builder.append(" / ");
    CharSequence _generateExpression_1 = TextGenerator.generateExpression(expr.getRight());
    _builder.append(_generateExpression_1);
    _builder.append(")");
    return _builder;
  }

  protected static CharSequence _generateExpression(final ExpressionMaximum expr) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("max(");
    CharSequence _generateExpression = TextGenerator.generateExpression(expr.getLeft());
    _builder.append(_generateExpression);
    _builder.append(", ");
    CharSequence _generateExpression_1 = TextGenerator.generateExpression(expr.getRight());
    _builder.append(_generateExpression_1);
    _builder.append(")");
    return _builder;
  }

  protected static CharSequence _generateExpression(final ExpressionMinimum expr) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("min(");
    CharSequence _generateExpression = TextGenerator.generateExpression(expr.getLeft());
    _builder.append(_generateExpression);
    _builder.append(", ");
    CharSequence _generateExpression_1 = TextGenerator.generateExpression(expr.getRight());
    _builder.append(_generateExpression_1);
    _builder.append(")");
    return _builder;
  }

  protected static CharSequence _generateExpression(final ExpressionModulo expr) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(fmod(");
    CharSequence _generateExpression = TextGenerator.generateExpression(expr.getLeft());
    _builder.append(_generateExpression);
    _builder.append(", ");
    CharSequence _generateExpression_1 = TextGenerator.generateExpression(expr.getRight());
    _builder.append(_generateExpression_1);
    _builder.append(") >=");
    _builder.newLineIfNotEmpty();
    _builder.append("0 ? fmod(");
    CharSequence _generateExpression_2 = TextGenerator.generateExpression(expr.getLeft());
    _builder.append(_generateExpression_2);
    _builder.append(", ");
    CharSequence _generateExpression_3 = TextGenerator.generateExpression(expr.getRight());
    _builder.append(_generateExpression_3);
    _builder.append(") :");
    _builder.newLineIfNotEmpty();
    _builder.append("fmod(");
    CharSequence _generateExpression_4 = TextGenerator.generateExpression(expr.getLeft());
    _builder.append(_generateExpression_4);
    _builder.append(", ");
    CharSequence _generateExpression_5 = TextGenerator.generateExpression(expr.getRight());
    _builder.append(_generateExpression_5);
    _builder.append(") +");
    _builder.newLineIfNotEmpty();
    CharSequence _generateExpression_6 = TextGenerator.generateExpression(expr.getRight());
    _builder.append(_generateExpression_6);
    _builder.append(")");
    return _builder;
  }

  protected static CharSequence _generateExpression(final ExpressionPower expr) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("pow(");
    CharSequence _generateExpression = TextGenerator.generateExpression(expr.getLeft());
    _builder.append(_generateExpression);
    _builder.append(", ");
    CharSequence _generateExpression_1 = TextGenerator.generateExpression(expr.getRight());
    _builder.append(_generateExpression_1);
    _builder.append(")");
    return _builder;
  }

  protected static CharSequence _generateExpression(final ExpressionMinus expr) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(-");
    CharSequence _generateExpression = TextGenerator.generateExpression(expr.getSub());
    _builder.append(_generateExpression);
    _builder.append(")");
    return _builder;
  }

  protected static CharSequence _generateExpression(final ExpressionPlus expr) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(+");
    CharSequence _generateExpression = TextGenerator.generateExpression(expr.getSub());
    _builder.append(_generateExpression);
    _builder.append(")");
    return _builder;
  }

  protected static CharSequence _generateExpression(final ExpressionBracket expr) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    CharSequence _generateExpression = TextGenerator.generateExpression(expr.getSub());
    _builder.append(_generateExpression);
    _builder.append(") ");
    return _builder;
  }

  protected static CharSequence _generateExpression(final ExpressionConstantInt expr) {
    StringConcatenation _builder = new StringConcatenation();
    int _value = expr.getValue();
    _builder.append(_value);
    return _builder;
  }

  protected static CharSequence _generateExpression(final ExpressionBalance expr) {
    StringConcatenation _builder = new StringConcatenation();
    Balance _value = expr.getValue();
    _builder.append(_value);
    return _builder;
  }

  protected static CharSequence _generateExpression(final ExpressionBinOp expr) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    CharSequence _generateExpression = TextGenerator.generateExpression(expr.getLeft());
    _builder.append(_generateExpression);
    _builder.append(" ");
    CharSequence _genBinOp = TextGenerator.genBinOp(expr.getBop());
    _builder.append(_genBinOp);
    _builder.newLineIfNotEmpty();
    CharSequence _generateExpression_1 = TextGenerator.generateExpression(expr.getRight());
    _builder.append(_generateExpression_1);
    _builder.append(")");
    return _builder;
  }

  public static CharSequence genBinOp(final BinaryBooleanOperator op) {
    if (op != null) {
      switch (op) {
        case AND:
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("AND");
          return _builder;
        case OR:
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("OR");
          return _builder_1;
        default:
          break;
      }
    }
    return null;
  }

  protected static CharSequence _generateExpression(final ExpressionCompOp expr) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    CharSequence _generateExpression = TextGenerator.generateExpression(expr.getLeft());
    _builder.append(_generateExpression);
    _builder.append(" ");
    CharSequence _genCompOp = TextGenerator.genCompOp(expr.getOp());
    _builder.append(_genCompOp);
    _builder.newLineIfNotEmpty();
    CharSequence _generateExpression_1 = TextGenerator.generateExpression(expr.getRight());
    _builder.append(_generateExpression_1);
    _builder.append(")");
    return _builder;
  }

  public static CharSequence genCompOp(final CompareOperator op) {
    if (op != null) {
      switch (op) {
        case EQ:
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("=");
          return _builder;
        case NEQ:
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("!=");
          return _builder_1;
        case GEQ:
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append(">=");
          return _builder_2;
        case G:
          StringConcatenation _builder_3 = new StringConcatenation();
          _builder_3.append(">");
          return _builder_3;
        case LEQ:
          StringConcatenation _builder_4 = new StringConcatenation();
          _builder_4.append("<=");
          return _builder_4;
        case L:
          StringConcatenation _builder_5 = new StringConcatenation();
          _builder_5.append("<");
          return _builder_5;
        default:
          break;
      }
    }
    return null;
  }

  protected static CharSequence _generateExpression(final BooleanExpressionBracket expr) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    CharSequence _generateExpression = TextGenerator.generateExpression(expr.getSub());
    _builder.append(_generateExpression);
    _builder.append(")");
    return _builder;
  }

  protected static CharSequence _generateExpression(final NotExpression expr) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("NOT (");
    CharSequence _generateExpression = TextGenerator.generateExpression(expr.getSub());
    _builder.append(_generateExpression);
    _builder.append(")");
    return _builder;
  }

  protected static CharSequence _generateExpression(final BooleanExpressionConstant expr) {
    StringConcatenation _builder = new StringConcatenation();
    boolean _isValue = expr.isValue();
    _builder.append(_isValue);
    return _builder;
  }

  public static CharSequence action2Text(final Action action) {
    if (action instanceof LunchAction) {
      return _action2Text((LunchAction)action);
    } else if (action instanceof MeetingAction) {
      return _action2Text((MeetingAction)action);
    } else if (action instanceof PaperAction) {
      return _action2Text((PaperAction)action);
    } else if (action instanceof PaymentAction) {
      return _action2Text((PaymentAction)action);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(action).toString());
    }
  }

  public static CharSequence generateExpression(final EObject expr) {
    if (expr instanceof BooleanExpressionBracket) {
      return _generateExpression((BooleanExpressionBracket)expr);
    } else if (expr instanceof BooleanExpressionConstant) {
      return _generateExpression((BooleanExpressionConstant)expr);
    } else if (expr instanceof ExpressionAddition) {
      return _generateExpression((ExpressionAddition)expr);
    } else if (expr instanceof ExpressionBalance) {
      return _generateExpression((ExpressionBalance)expr);
    } else if (expr instanceof ExpressionBinOp) {
      return _generateExpression((ExpressionBinOp)expr);
    } else if (expr instanceof ExpressionBracket) {
      return _generateExpression((ExpressionBracket)expr);
    } else if (expr instanceof ExpressionCompOp) {
      return _generateExpression((ExpressionCompOp)expr);
    } else if (expr instanceof ExpressionConstantInt) {
      return _generateExpression((ExpressionConstantInt)expr);
    } else if (expr instanceof ExpressionDivision) {
      return _generateExpression((ExpressionDivision)expr);
    } else if (expr instanceof ExpressionMaximum) {
      return _generateExpression((ExpressionMaximum)expr);
    } else if (expr instanceof ExpressionMinimum) {
      return _generateExpression((ExpressionMinimum)expr);
    } else if (expr instanceof ExpressionMinus) {
      return _generateExpression((ExpressionMinus)expr);
    } else if (expr instanceof ExpressionModulo) {
      return _generateExpression((ExpressionModulo)expr);
    } else if (expr instanceof ExpressionMultiply) {
      return _generateExpression((ExpressionMultiply)expr);
    } else if (expr instanceof ExpressionPlus) {
      return _generateExpression((ExpressionPlus)expr);
    } else if (expr instanceof ExpressionPower) {
      return _generateExpression((ExpressionPower)expr);
    } else if (expr instanceof ExpressionSubtraction) {
      return _generateExpression((ExpressionSubtraction)expr);
    } else if (expr instanceof NotExpression) {
      return _generateExpression((NotExpression)expr);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(expr).toString());
    }
  }
}
