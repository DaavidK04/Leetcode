public int myAtoi(String s) {
    int i = 0, sign = 1, result = 0;
    int n = s.length();

    // 1. Whitespace überspringen
    while (i < n && s.charAt(i) == ' ') i++;

    // 2. Vorzeichen checken
    if (i < n && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
        sign = (s.charAt(i) == '-') ? -1 : 1;
        i++;
    }

    // 3. Zahlen einlesen
    while (i < n && Character.isDigit(s.charAt(i))) {
        int digit = s.charAt(i) - '0';

        // 4. Overflow-Check
        if (result > (Integer.MAX_VALUE - digit) / 10) {
            return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }

        result = result * 10 + digit;
        i++;
    }

    return sign * result;
}
