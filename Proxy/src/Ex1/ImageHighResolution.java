package Ex1;

public class ImageHighResolution implements Image{

    private String imageFilePath;
    private ImageHighResolution proxifiedImage;

    public ImageHighResolution(String imageFilePath) {
        this.imageFilePath = imageFilePath;
        System.out.println("Low resolution preview image of file " + imageFilePath);
    }

    @Override
    public void showImage(User user) {
        System.out.println();
        if(){
           this.proxifiedImage = ;
        }
    }
}
