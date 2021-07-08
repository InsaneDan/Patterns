package ChainOfResponsibility.Handlers;

import ChainOfResponsibility.Handlers.File;

public class AudioFileHandler implements Handler {

    private Handler handler;
    private String handlerName;

    public AudioFileHandler(String handlerName){
        this.handlerName = handlerName;
    }

    @Override
    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void process(File file) {

        if (file.getFileType().equals("audio")) {
            System.out.println("Обработка аудио-файла ... " + handlerName);
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
