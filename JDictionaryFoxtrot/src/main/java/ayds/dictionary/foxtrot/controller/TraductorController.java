package ayds.dictionary.foxtrot.controller;

import ayds.dictionary.foxtrot.view.TraductorView;

public interface TraductorController {

  void onEventUpdate(String request);
  void setTraductorView(TraductorView traductorView);
}
