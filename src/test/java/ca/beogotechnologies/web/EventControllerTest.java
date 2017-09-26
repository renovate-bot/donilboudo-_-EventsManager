package ca.beogotechnologies.web;

import ca.beogotechnologies.service.EventService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;

public class EventControllerTest {
    @Mock
    private EventService eventService;

    @InjectMocks
    private EventController eventController;

    @Before
    public void setUp() throws Exception {
        eventController = new EventController();
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getEvents() throws Exception {
    }

    @Test
    public void getEvent() throws Exception {
    }

    @Test
    public void insertEvent() throws Exception {
    }

    @Test
    public void updateEvent() throws Exception {
    }

}