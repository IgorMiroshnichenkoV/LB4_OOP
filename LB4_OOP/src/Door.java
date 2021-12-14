public class Door {
    private String material;
    private int height;
    private int width;
    private String color;
    private boolean open;
    private boolean close;

    public void open() {
        open = true;
    }

    public void close() {
        close = true;
    }

    public void paint(String color) {
        this.color = color;
    }

    public void size(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public boolean isClose() {
        return close;
    }

    public void setClose(boolean close) {
        this.close = close;
    }
}
