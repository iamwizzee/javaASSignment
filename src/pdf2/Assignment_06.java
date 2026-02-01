package pdf2;

public class Assignment_06 {

    public static void main(String[] args) {

        String string = "this is string";
        StringBuffer stringBuffer = new StringBuffer("this is string buffer");

        System.out.println("String = " + string); // String = this is string

        // charAT
        System.out.println(string.charAt(0)); // t

        // compare to
        System.out.println(string.compareTo("hello world")); // 12

        // equals
        System.out.println(string.equals(string)); // true

        // concat
        System.out.println(string.concat(" more string")); // this is string more string

        // contains
        System.out.println(string.contains("this")); // true

        // lower case
        System.out.println(string.toLowerCase()); // this is string

        // uppercase
        System.out.println(string.toUpperCase());// THIS IS STRING

        // indexOf
        System.out.println(string.indexOf("string")); // 8

        // length()
        System.out.println(string.length()); // 14

        System.out.println("StringBuffer = " + stringBuffer); // StringBuffer = this is string buffer

        // isEmpty()
        System.out.println(stringBuffer.isEmpty());

        // substring()
        System.out.println(stringBuffer.substring(5, 10)); // is st

        // append()
        System.out.println(stringBuffer.append(" appened text")); // tis string buffer appened text

        // delete()
        System.out.println(stringBuffer.delete(1, 5)); // tis string buffer appened text

    }
}

// =================string methods====================

// charAt(int index) = returns the character at the specified index

// compareTo(String str) = compares two strings lexicographically and returns an
// integer value

// equals(Object obj) = checks whether two strings are equal in content

// concat(String str) = concatenates the specified string to the end of the
// current string

// contains(CharSequence s) = checks if the string contains the specified
// sequence of characters

// toLowerCase() = converts all characters of the string to lowercase

// toUpperCase() = converts all characters of the string to uppercase

// indexOf(String str) = returns the index of the first occurrence of the
// specified substring

// length() = returns the length of the string

// =============string buffer methods=============

// isEmpty() = checks whether the StringBuffer is empty or not

// substring(int start, int end) = returns a substring from the specified start
// index to end index

// append(String str) = appends the specified string to the end of the
// StringBuffer

// delete(int start, int end) = removes characters from the specified start
// index to end index
