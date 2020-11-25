package controller;

import java.util.ArrayList;

import dto.ReplyDTO;

public class ReplyController {
    ArrayList<ReplyDTO> list;
    
    public ReplyController() {
        list = new ArrayList<>();
    }
    
    // 해당 글의 댓글 목록을 불러오는 selectByBoardId()
    public ArrayList<ReplyDTO> selectByBoardId(int boardId){
        ArrayList<ReplyDTO> temp = new ArrayList<>();
        for(ReplyDTO r : list) {
            if(r.getBoardId() == boardId) {
                temp.add(r);
                
            }
        }
        return temp;
    }
    
    // 댓글을 list에 추가하는 insert
    public void insert(ReplyDTO r) {
        list.add(r);
    }
}
















