package cn.putao.alarmclock;

public interface CaptchaInterface
{
  public interface OnCorrectListener {
    public void onCorrect();
  }
  public void show();
  public void dismiss();
  public void setOnCorrectListener(OnCorrectListener listener);
}
