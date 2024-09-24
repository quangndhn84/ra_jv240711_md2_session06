package ra.static_demo;

public class RikkeiAcademy {
    public static int view = 0;

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }

    public void visited() {
        view++;
    }
}
