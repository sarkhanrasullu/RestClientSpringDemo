/**
 * 
 */
package main.model;

import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * @author kshah
 *
 */
public class Transaction implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = 8951221480021840448L;
  
  Long id;
  
  Book book;
  
  Member member;
  //Date and time of issuance of this book
  LocalDateTime dateOfIssue;
  
  //Date and time of return of this book
  LocalDateTime dateOfReturn;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Book getBook() {
    return book;
  }

  public void setBook(Book book) {
    this.book = book;
  }

  public Member getMember() {
    return member;
  }

  public void setMember(Member member) {
    this.member = member;
  }

  public LocalDateTime getDateOfIssue() {
    return dateOfIssue;
  }

  public void setDateOfIssue(LocalDateTime dateOfIssue) {
    this.dateOfIssue = dateOfIssue;
  }

  public LocalDateTime getDateOfReturn() {
    return dateOfReturn;
  }

  public void setDateOfReturn(LocalDateTime dateOfReturn) {
    this.dateOfReturn = dateOfReturn;
  }

  @Override
  public String toString() {
    return "Transaction [id=" + id + ", book=" + book + ", member=" + member + ", dateOfIssue=" + dateOfIssue + ", dateOfReturn=" + dateOfReturn + "]";
  }

}
