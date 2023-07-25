package com.fastcampus.ch4.dao;

import com.fastcampus.ch4.domain.BoardDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class BoardDaoTest {
    @Autowired
    BoardDao boardDao;

    @Test
    public void select() throws Exception{
        assertTrue(boardDao != null);
        System.out.println("boardDao = " + boardDao); //boardDao = com.fastcampus.ch4.dao.BoardDaoImpl@f9b5552
        BoardDto boardDto = boardDao.select(1);
        System.out.println("boardDto = " + boardDto);
        assertTrue(boardDto.getBno().equals(1)); //boardDto = BoardDto{bno=1, title='첫글', content='임', writer='th', view_cnt=0, comment_cnt=0, reg_date=Tue Jul 25 23:56:22 KST 2023}
    }
}