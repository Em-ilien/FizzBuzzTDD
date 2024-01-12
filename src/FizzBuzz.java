class FizzBuzz {
    String transform(int input) {
        if (input % 15 == 0)
            return "FizzBuzz";
        if (input % 3 == 0)
            return "Fizz";
        if (input % 5 == 0)
            return "Buzz";
        return String.valueOf(input);
    }
    
    String enter(int start, int end) {
        final StringBuilder result = new StringBuilder();
        for (int i = start; i <= end; i++)
            result.append(transform(i));
        return result.toString();
    }
}