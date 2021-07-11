package ChainOfResponsibility.Handlers;

import ChainOfResponsibility.Handlers.File;

public class DocFileHandler implements Handler {

    private Handler handler;
    private String handlerName;

    public DocFileHandler(String handlerName) {
        this.handlerName = handlerName;
    }

    @Override
    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void process(File file) {

        if (file.getFileType().equals("doc")) {
            System.out.println("Обработка doc-файла ... " + handlerName);
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
