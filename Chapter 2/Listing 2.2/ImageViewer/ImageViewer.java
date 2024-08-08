import java.awt.*;
import java.io.*;
import javax.swing.*;

/**
 * 이미지를 보기 위한 프로그램입니다.
 * @version 1.31 2018-04-10
 * @author Cay Horstmann
 */
public class ImageViewer
{
    public static void main(String[] args)
    {
        EventQueue.invokeLater(() -> {
            var frame = new ImageViewerFrame();
            frame.setTitle("ImageViewer");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}

/**
 * 이미지를 표시하기 위한 레이블을 가진 프레임입니다.
 */
class ImageViewerFrame extends JFrame
{
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 400;

    public ImageViewerFrame()
    {
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

        // 이미지를 표시하기 위해 레이블 사용
        var label = new JLabel();
        add(label);

        // 파일 선택기 설정
        var chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("."));

        // 메뉴 바 설정
        var menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        var menu = new JMenu("File");
        menuBar.add(menu);

        var openItem = new JMenuItem("Open");
        menu.add(openItem);
        openItem.addActionListener(event -> {
            // 파일 선택 대화 상자 열기
            int result = chooser.showOpenDialog(null);

            // 파일이 선택되면 레이블에 아이콘으로 설정
            if (result == JFileChooser.APPROVE_OPTION)
            {
                String name = chooser.getSelectedFile().getPath();
                label.setIcon(new ImageIcon(name));
            }
        });

        var exitItem = new JMenuItem("Exit");
        menu.add(exitItem);
        exitItem.addActionListener(event -> System.exit(0));
    }
}
