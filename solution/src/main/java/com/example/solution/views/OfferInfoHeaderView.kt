package com.example.solution.views

import android.content.Context
import android.graphics.Color
import android.graphics.Typeface
import android.graphics.Typeface.BOLD
import android.graphics.drawable.GradientDrawable
import android.util.AttributeSet
import android.util.TypedValue
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.widget.AppCompatImageView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import androidx.core.content.res.ResourcesCompat
import com.example.solution.R
import com.example.solution.utils.extensions.dpToPx
import com.example.solution.utils.extensions.spToPx

/**
 * Задача 8
 *
 * Шапка экрана "Детали офферов"
 *
 * Макет - "../images/figma/offerHeaderView.svg"
 */
class OfferInfoHeaderView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
) : LinearLayout(context, attrs, defStyleAttr) {

    private lateinit var infoHeaderTitle: TextView
    private lateinit var infoHeaderText: TextView
    private lateinit var infoHeaderImage: ImageView
    //private lateinit var infoHeaderBack: AppCompatImageView
    /**
     * Устанавливает Процент кэшбека
     *
     * input: Процент кэшбека в формате "n%" (где n - какое-то число)
     */
    fun setCashBackValue(cashBackValue: String) {
        // TODO add logic
        infoHeaderTitle = findViewById(R.id.offerInfoHeaderTitle)
        infoHeaderTitle.text = cashBackValue
    }

    /**
     * Устанавливает Краткое описание спецпредложения
     *
     * input: Название
     */
    fun setCashBackName(cashBackName: String) {
        // TODO add logic
        infoHeaderText = findViewById(R.id.offerInfoHeaderTitle)
        infoHeaderText.text = cashBackName
    }

    /**
     * Устанавливает Картинку спецофера
     *
     * input: id ресурса картинки
     */
    fun setImage(imageResId: Int) {
        // TODO add logic
        infoHeaderImage = findViewById(R.id.offerInfoHeaderTitle)
        infoHeaderImage.setImageResource(imageResId)
    }

    /**
     * Устанавливает Фон компонента
     *
     * input: Hex код цвета в формате строки (например "#FFC6C6")
     */
    fun setBackgroundColor(colorHex: String) {
        // TODO add logic
        //infoHeaderBack = findViewById(R.layout.view_offer_info_header);
    }

    //TODO add UI
}
