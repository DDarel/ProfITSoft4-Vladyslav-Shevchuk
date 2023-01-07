package my.app.servlets;


import my.app.dao.UserDAO;
import my.app.model.User;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.util.concurrent.atomic.AtomicReference;

import static my.app.model.User.ROLE.USER;

@WebListener
public class ContextListener implements ServletContextListener {

    private AtomicReference<UserDAO> dao;

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {

        dao = new AtomicReference<>(new UserDAO());

        dao.get().add(new User(1, "DDarel",  "Vlad",   "1", USER));
        dao.get().add(new User(2, "monstr",  "Vera",   "1", USER));
        dao.get().add(new User(3, "svetik01","Sveta",  "1", USER));
        dao.get().add(new User(4, "mishka",  "Misha",  "1", USER));
        dao.get().add(new User(5, "kiril",   "Kirill", "1", USER));

        final ServletContext servletContext =
                servletContextEvent.getServletContext();

        servletContext.setAttribute("dao", dao);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        dao = null;
    }
}