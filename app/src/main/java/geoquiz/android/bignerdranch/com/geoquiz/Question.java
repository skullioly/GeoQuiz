package geoquiz.android.bignerdranch.com.geoquiz;

public class Question {
    private int mTextResId;

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    private boolean mAnswerTrue;

    public Question(int textResId, boolean answerTrue){
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
    }
}
