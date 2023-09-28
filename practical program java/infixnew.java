import java.util.Stack;

class infixnew {
  static int precision(char ch) {
    switch (ch) {
      case '(':
      case ')':
        return 0;
      case '+':
      case '-':
        return 1;
      case '*':
      case '/':
        return 2;
    }
    return -1;
  }

  static String convert(String exp) {
    String result = new String("");
    Stack<Character> stack = new Stack<>();

    for (int i = 0; i < exp.length(); i++) {
      char c = exp.charAt(i);

      if (Character.isLetterOrDigit(c)) {
        result += c;
      } else if (c == '(') {
        stack.push(c);
      } else if (c == ')') {
        while (!stack.isEmpty() && stack.peek() != '(') {
          result += stack.pop();
        }
        stack.pop();
      } else {
        while (!stack.isEmpty() && precision(c) <= precision(stack.peek())) {
          result += stack.pop();
        }
        stack.push(c);
      }
    }

    while (!stack.isEmpty()) {
      if (stack.peek() == '(') {
        return "Invalid Expression";
      }
      result += stack.pop();
    }

    return result;
  }

  public static int evaluatePostfix(String exp1) {
    Stack<Integer> stack = new Stack<>();
    try {
      for (int i = 0; i < exp1.length(); i++) {
        char c = exp1.charAt(i);
        if (Character.isDigit(c)) {
          stack.push(c - '0');
        } else {
          int val1 = stack.pop();
          int val2 = stack.pop();
          switch (c) {
            case '+':
              stack.push(val2 + val1);
              break;
            case '-':
              stack.push(val2 - val1);
              break;
            case '*':
              stack.push(val2 * val1);
              break;
            case '/':
              stack.push(val2 / val1);
              break;
          }
        }
      }
      return stack.pop();
    } catch (Exception e) {
      return 0; // Handle the exception by returning a default value (0 in this case).
    }
  }

  public static void main(String[] args) {
    System.out.println("Given Infix Expression: A+B*C-(D/E)");
    String exp = "A+B*C-(D/E)";

    System.out.print("Postfix Expression: ");
    System.out.println(convert(exp));

    System.out.println("Evaluation for A=2, B=3, C=4, D=8, E=1");
    String exp1 = "234*81/-+";

    try {
      System.out.println("Postfix evaluation: " + evaluatePostfix(exp1));
    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
}
