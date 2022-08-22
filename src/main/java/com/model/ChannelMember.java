package com.model;

import javax.persistence.*;

@Entity
@Table(name = "channel_member")
public class ChannelMember {

    @Id
    @Column(name="channel_member_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int channelMemberId;

    @Column(name="channel_id")
    private int channelId;

    @Column(name="user_id")
    private int userId;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="user_id", insertable = false, updatable = false)
    private UserDetails userDetails;

    public int getChannelMemberId() {
        return channelMemberId;
    }

    public void setChannelMemberId(int channelMemberId) {
        this.channelMemberId = channelMemberId;
    }

    public int getChannelId() {
        return channelId;
    }

    public void setChannelId(int channelId) {
        this.channelId = channelId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public UserDetails getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }
}

