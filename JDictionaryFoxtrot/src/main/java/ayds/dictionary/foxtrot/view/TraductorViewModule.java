package ayds.dictionary.foxtrot.view;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

import ayds.dictionary.foxtrot.controller.TraductorController;
import ayds.dictionary.foxtrot.model.TraductorModelModule;
public class TraductorViewModule {

  private static TraductorViewModule instance;
  private TraductorViewModule() { }

  public static TraductorViewModule getInstance() {
    if (instance == null) {
      instance = new TraductorViewModule();
    }
    return instance;
  }


  public TraductorView openTraductorWindow(TraductorController traductorController) {
    TraductorViewImpl traductorView = new TraductorViewImpl(traductorController, TraductorModelModule.getInstance().getTraductorModel());

    JFrame frame = new JFrame("Online Dictionary");
    frame.setContentPane(traductorView.getContentPane());
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);

    return traductorView;
  }
}
