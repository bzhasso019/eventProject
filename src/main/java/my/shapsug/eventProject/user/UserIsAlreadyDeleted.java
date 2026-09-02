package my.shapsug.eventProject.user;

public class UserIsAlreadyDeleted extends RuntimeException {
  public UserIsAlreadyDeleted(long id) {
    super("Пользователь с айди " + id + " уже удален");
  }
}
