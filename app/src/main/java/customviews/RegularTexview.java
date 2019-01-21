package customviews;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

public class RegularTexview extends AppCompatTextView {
    public RegularTexview(Context context) {
        super(context);
        init();
    }

    public RegularTexview(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public RegularTexview(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    void init(){
        Typeface face=Typeface.createFromAsset(getContext().getAssets(), "opensansregular.ttf");
        this.setTypeface(face);
    }
}
