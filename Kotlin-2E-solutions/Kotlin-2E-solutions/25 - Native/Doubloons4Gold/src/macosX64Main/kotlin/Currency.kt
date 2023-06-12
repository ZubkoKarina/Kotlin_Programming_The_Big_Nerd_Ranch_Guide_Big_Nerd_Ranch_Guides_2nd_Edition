import platform.Foundation.*

actual fun Double.formatAsCurrency(): String {
    val formatter = NSNumberFormatter().apply {
        setNumberStyle(NSNumberFormatterCurrencyStyle)
        setLocale(NSLocale.currentLocale)
    }

    val number = NSNumber(this)
    return formatter.stringFromNumber(number)!!
}