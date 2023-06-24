package constants;

public class MenuBarConstants {
  public static final String MENU_TITLE = "File";
  public static final String MENU_TITLE_0 = "ZoomIn/Out";
  public static final String MENU_TITLE_1 = "Switch";
  public static final String MENU_TITLE_2 = "Information";

  public static final String MENU_ITEM_OPEN_PICTURE = "Open Picture";
  public static final String MENU_ITEM_EXAMINE_LIST = "Examine List";
  public static final String MENU_ITEM_SELECT_DIRECTORY = "Select Directory";
  public static final String MENU_ITEM_INPUT_PATH = "Enter Path";

  public static final String MENU_ITEM_SLIDE_PLAY = "Slide play (F5:On / F9:Stop)";

  /**
   * 开播幻灯片
   */
  // public static final String MENU_ITEM_SLIDE_START = "Slide Play Start";

  // /**
  // * 停播幻灯片
  // */
  // public static final String MENU_ITEM_SLIDE_STOP = "Slide Play Stop";

  /**
   * 上一张
   */
  public static final String MENU_ITEM_PREVIOUS = "Previous (Left / Up / Page Up)";

  /**
   * 下一张
   */
  public static final String MENU_ITEM_NEXT = "Next (Right / Down / Page Down)";

  /**
   * 放大
   */
  public static final String MENU_ITEM_ZOOM_IN = "Zoom In ( ctrl + )";

  /**
   * 缩小
   */
  public static final String MENU_ITEM_ZOOM_OUT = "Zoom Out ( ctrl - )";

  /**
   * 缩放复原
   */
  public static final String MENU_ITEM_ZOOM_RECONVERION = "Zoom Reconversion  ( ctrl 0 )";

  public static final String MENU_ITEM_DELETE = "Delete";

  /**
   * 查看文件属性信息
   */
  public static final String MENU_ITEM_CHECK_PROPERTIES = "Properties";

  /**
   * File Operations
   */
  public static String[] MENU_ITEM_ARRAY = { MENU_ITEM_OPEN_PICTURE, MENU_ITEM_SELECT_DIRECTORY,
      MENU_ITEM_INPUT_PATH, MENU_ITEM_DELETE
  };

  /**
   * ZOOM In/Out
   */
  public static String[] MENU_ITEM_ARRAY_0 = { MENU_ITEM_ZOOM_IN, MENU_ITEM_ZOOM_OUT, MENU_ITEM_ZOOM_RECONVERION,
  };

  /**
   * Switch Picture
   */
  public static String[] MENU_ITEM_ARRAY_1 = {
      MENU_ITEM_SLIDE_PLAY,
      MENU_ITEM_NEXT, MENU_ITEM_PREVIOUS };

  /**
   * Infomation
   */
  public static String[] MENU_ITEM_ARRAY_2 = { MENU_ITEM_EXAMINE_LIST, MENU_ITEM_CHECK_PROPERTIES };

}