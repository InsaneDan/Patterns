package ChainOfResponsibility.Handlers;

public class ImageFileHandler implements Handler {

    private Handler handler;
    private String handlerName;

    public ImageFileHandler(String handlerName){
        this.handlerName = handlerName;
    }

    @Override
    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void process(ChainOfResponsibility.Handlers.File file) {

        if (file.getFileType().equals("image")) {
            System.out.println("Обработка файла-изображения ... " + handlerName);
        } else if (handler != null) {
            System.out.println(handlerName + " ~~> " + handler.getHandlerName());
            handler.process(file);
        } else {
            System.out.println("Тип файла не поддерживается.");
        }

    }

    @Override
    public String getHandlerName() {
        return handlerName;
    }

}
