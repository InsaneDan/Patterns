package ChainOfResponsibility.Handlers;

import ChainOfResponsibility.Handlers.File;

public class VideoFileHandler implements Handler {

    private Handler handler;
    private String handlerName;

    public VideoFileHandler(String handlerName){
        this.handlerName = handlerName;
    }

    @Override
    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void process(File file) {

        if (file.getFileType().equals("video")) {
            System.out.println("Обработка видео файла ... " + handlerName);
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
