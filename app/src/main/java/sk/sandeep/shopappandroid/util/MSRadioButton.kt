package sk.sandeep.shopappandroid.util

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatRadioButton

/**
 * This class will be used for Custom font text using the Radio Button which inherits the AppCompatRadioButton class.
 */
class MSRadioButton(context: Context, attrs: AttributeSet) :
    AppCompatRadioButton(context, attrs) {

    /**
     * The init block runs every time the class is instantiated.
     */
    init {
        // Call the function to apply the font to the components.
        applyFont()
    }

    /**
     * Applies a font to a Radio Button.
     */
    private fun applyFont() {
        val typeface: Typeface = Typeface.createFromAsset(context.assets, "montserrat_bold.ttf")
        setTypeface(typeface)
    }
}