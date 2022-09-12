package sk.sandeep.shopappandroid.util

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatButton

class MSCustomButton(context: Context, attrs: AttributeSet) : AppCompatButton(context, attrs) {
    init {
        applyFont()
    }
    private fun applyFont() {
        val typeface: Typeface = Typeface.createFromAsset(context.assets, "montserrat_bold.ttf")
        setTypeface(typeface)
    }
}