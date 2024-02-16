package WhenExpressions

fun bmiMetricOld(
    kg: Double,
    heightM: Double
): String {
    val bmi =  kg / (heightM * heightM)
    return if (bmi < 18.5 ) "Underweight"
        else if (bmi < 25) "Normal weight"
        else "Overweight"
}

fun bmiMetricWithWhen(
    kg: Double,
    heightM: Double
): String {
    val bmi = kg / (heightM * heightM)
    return when {
        bmi < 18.5 -> "Underweight"
        bmi < 25 -> "Normal weight"
        else -> "Overweight"
    }
}

fun main() {
    val bmiold = bmiMetricOld(65.0, 163.0)
    val bminew = bmiMetricWithWhen(65.0, 163.0)

    println(bmiold)
    println(bminew)
}