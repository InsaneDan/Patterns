package ChainOfResponsibility.Handlers;

import ChainOfResponsibility.Handlers.File;

public interface Handler {
    void setHandler(Handler handler);
    void process(File file);
    String getHandlerName();
}
