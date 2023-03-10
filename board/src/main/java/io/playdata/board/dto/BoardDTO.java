package io.playdata.board.dto;

public class BoardDTO {
	private Integer id;
	private String title;
	private String content;
	private String userName;
	private String createDate;
	
	
	public BoardDTO(String title, String content, String userName) {
		super();
		this.title = title;
		this.content = content;
		this.userName = userName;
	}
	
	public BoardDTO(Integer id, String title, String content, String userName, String createDate) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.userName = userName;
		this.createDate = createDate;
	}
	public BoardDTO(Integer id) {
		super();
		this.id = id;
	}
	@Override
	public String toString() {
		return "BoardDTO [id=" + id + ", title=" + title + ", content=" + content + ", userName=" + userName
				+ ", createDate=" + createDate + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	
	
}
