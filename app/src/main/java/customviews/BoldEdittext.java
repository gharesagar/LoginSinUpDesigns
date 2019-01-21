package customviews;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.widget.EditText;

public class BoldEdittext extends EditText {
    public BoldEdittext(Context context) {
        super(context);
        init();
    }

    public BoldEdittext(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public BoldEdittext(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    void init(){
        Typeface face=Typeface.createFromAsset(getContext().getAssets(), "opensansbold.ttf");
        this.setTypeface(face);
    }
}
