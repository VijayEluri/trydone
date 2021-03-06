/*
 * Copyright (c) JForum Team
 * All rights reserved.

 * Redistribution and use in source and binary forms, 
 * with or without modification, are permitted provided 
 * that the following conditions are met:

 * 1) Redistributions of source code must retain the above 
 * copyright notice, this list of conditions and the 
 * following  disclaimer.
 * 2)  Redistributions in binary form must reproduce the 
 * above copyright notice, this list of conditions and 
 * the following disclaimer in the documentation and/or 
 * other materials provided with the distribution.
 * 3) Neither the name of "Rafael Steil" nor 
 * the names of its contributors may be used to endorse 
 * or promote products derived from this software without 
 * specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT 
 * HOLDERS AND CONTRIBUTORS "AS IS" AND ANY 
 * EXPRESS OR IMPLIED WARRANTIES, INCLUDING, 
 * BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF 
 * MERCHANTABILITY AND FITNESS FOR A PARTICULAR 
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL 
 * THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE 
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, 
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES 
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF 
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, 
 * OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER 
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER 
 * IN CONTRACT, STRICT LIABILITY, OR TORT 
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN 
 * ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF 
 * ADVISED OF THE POSSIBILITY OF SUCH DAMAGE
 * 
 * This file creation date: 20/05/2004 - 15:24:07
 * net.jforum.entities.PrivateMessage.java
 * The JForum Project
 * http://www.jforum.net
 */
package net.jforum.entities;

import java.util.Date;

/**
 * @author Rafael Steil
 * @version $Id: PrivateMessage.java,v 1.6 2006/12/06 21:56:28 rafaelsteil Exp $
 */
public class PrivateMessage 
{
	private int id;
	private int type;
	private User fromUser;
	private User toUser;
	private Post post;
	private String formatedDate;
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public PrivateMessage() { }
	
	public PrivateMessage(int id) {
		this.id = id;
	}
	
	/**
	 * @return Returns the fromUser.
	 */
	public User getFromUser()
	{
		return fromUser;
	}
	
	/**
	 * @param fromUser The fromUser to set.
	 */
	public void setFromUser(User fromUser)
	{
		this.fromUser = fromUser;
	}
	
	/**
	 * @return Returns the toUser.
	 */
	public User getToUser()
	{
		return toUser;
	}
	
	/**
	 * @param toUser The toUser to set.
	 */
	public void setToUser(User toUser)
	{
		this.toUser = toUser;
	}
	
	/**
	 * @return Returns the type.
	 */
	public int getType()
	{
		return type;
	}
	
	/**
	 * @param type The type to set.
	 */
	public void setType(int type)
	{
		this.type = type;
	}
	
	/**
	 * @return Returns the id.
	 */
	public int getId()
	{
		return id;
	}

	/**
	 * @param id The id to set.
	 */
	public void setId(int id)
	{
		this.id = id;
	}
	
	/**
	 * @return Returns the post.
	 */
	public Post getPost()
	{
		return post;
	}
	
	/**
	 * @param post The post to set.
	 */
	public void setPost(Post post)
	{
		this.post = post;
	}
	
	/**
	 * @return Returns the formatedDate.
	 */
	public String getFormatedDate()
	{
		return formatedDate;
	}
	
	/**
	 * @param formatedDate The formatedDate to set.
	 */
	public void setFormatedDate(String formatedDate)
	{
		this.formatedDate = formatedDate;

    }
}
