package com.betleopard.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ben
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class Event {

    private final long id;
    private final String name;
    private final LocalDate date;
    private final List<Race> races = new ArrayList<>();

    public Event(final long raceID, final String raceName, final LocalDate raceDay) {
        id = raceID;
        name = raceName;
        date = raceDay;
    }

    @JsonProperty
    public long getId() {
        return id;
    }

    @JsonProperty
    public String getName() {
        return name;
    }

    @JsonProperty
    public LocalDate getDate() {
        return date;
    }

    @JsonProperty
    public List<Race> getRaces() {
        return races;
    }

    @Override
    public String toString() {
        return "Event{" + "id=" + id + ", name=" + name + ", date=" + date + ", races=" + races + '}';
    }
}
