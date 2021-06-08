package com.lgs.eden.api.profile.friends;

import com.lgs.eden.api.profile.friends.conversation.ConversationData;
import com.lgs.eden.api.profile.friends.messages.MessageData;

import java.util.ArrayList;

/**
 * Wrapper for the message view.
 * We are fetching the message with the user requested
 * and some basic information about the other conversations.
 */
public class FriendConversationView {

    public final int friendID;
    public final ArrayList<MessageData> messages;
    public final ArrayList<ConversationData> conversations;

    public FriendConversationView(int friendID, ArrayList<MessageData> messages, ArrayList<ConversationData> conversations) {
        this.friendID = friendID;
        this.messages = messages;
        this.conversations = conversations;
    }
}