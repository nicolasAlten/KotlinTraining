package Regex

fun RegexExpressionExample() {

    val regexExpression = "a([ab]+)d?"
    val regex = regexExpression.toRegex()
    val textToValidate = "My text to validate"

    print(regex.containsMatchIn(textToValidate))
}