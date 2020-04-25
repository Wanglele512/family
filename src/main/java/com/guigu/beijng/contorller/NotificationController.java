package com.guigu.beijng.contorller;

import com.guigu.beijng.dto.CommentDTO;
import com.guigu.beijng.dto.NotificationDTO;
import com.guigu.beijng.dto.QuestionDTO;
import com.guigu.beijng.enume.CommentTypeEnum;
import com.guigu.beijng.enume.NotificationTypeEnum;
import com.guigu.beijng.model.User;
import com.guigu.beijng.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class NotificationController {
    @Autowired
    private NotificationService notificationService;

    @GetMapping("/notification/{id}")
    public String question(@PathVariable(name = "id") Long id,
                           HttpServletRequest request){
        User user = (User) request.getSession().getAttribute("user");
        if(user==null){
            return "redirect:/";
        }
        NotificationDTO notificationDTO = notificationService.read(id,user);
        if (NotificationTypeEnum.REPLY_COMMENT.getType() == notificationDTO.getType()
                || NotificationTypeEnum.REPLY_QUESTION.getType() == notificationDTO.getType()) {
            return "redirect:/question/" + notificationDTO.getOutid();
        } else {
            return "redirect:/";
        }
    }

}
