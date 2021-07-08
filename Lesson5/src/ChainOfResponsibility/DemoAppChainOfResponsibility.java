package ChainOfResponsibility;

import ChainOfResponsibility.Handlers.*;
import ChainOfResponsibility.Handlers.File;

public class DemoAppChainOfResponsibility {

    public static void main(String[] args) {

        File file = null;

        // создаем хэндлеры
        Handler textHandler = new TextFileHandler("TextHandler");
        Handler docHandler = new DocFileHandler("DocHandler");
        Handler excelHandler = new ExcelFileHandler("ExcelHandler");
        Handler imageHandler = new ImageFileHandler("ImageHandler");
        Handler audioHandler = new AudioFileHandler("AudioHandler");
        Handler videoHandler = new VideoFileHandler("VideoHandler");

        // задаем последовательность проверок
        textHandler.setHandler(docHandler);
        docHandler.setHandler(excelHandler);
        excelHandler.setHandler(audioHandler);
        audioHandler.setHandler(videoHandler);
        videoHandler.setHandler(imageHandler);

        // обрабатываем файлы
        file = new File("MusicFile.mp3", "audio");
        textHandler.process(file);
        System.out.println("---------------------------------");
        file = new File("VideoFile.jpg", "image");
        textHandler.process(file);
        System.out.println("---------------------------------");
        file = new File("ExcelFile.doc", "excel");
        textHandler.process(file);
        System.out.println("---------------------------------");
        file = new File("UnknownFile.err", "err");
        textHandler.process(file);
    }

}

/* РЕЗУЛЬТАТ (консоль):

TextHandler ~~> DocHandler
DocHandler ~~> ExcelHandler
ExcelHandler ~~> AudioHandler
Обработка аудио-файла ... AudioHandler
---------------------------------
TextHandler ~~> DocHandler
DocHandler ~~> ExcelHandler
ExcelHandler ~~> AudioHandler
AudioHandler ~~> VideoHandler
VideoHandler ~~> ImageHandler
Обработка файла-изображения ... ImageHandler
---------------------------------
TextHandler ~~> DocHandler
DocHandler ~~> ExcelHandler
Обработка файла Excel ... ExcelHandler
---------------------------------
TextHandler ~~> DocHandler
DocHandler ~~> ExcelHandler
ExcelHandler ~~> AudioHandler
AudioHandler ~~> VideoHandler
VideoHandler ~~> ImageHandler
Тип файла не поддерживается.

*/