package com.stackroute.MuzixApplication.resource;

import com.stackroute.MuzixApplication.document.Track;
import com.stackroute.MuzixApplication.repository.MuzixRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/muzix")
@CrossOrigin("http://localhost:4200")

public class UserResource {

private MuzixRepository muzixRepository;

    public UserResource(MuzixRepository muzixRepository) {
        this.muzixRepository = muzixRepository;
    }


    @GetMapping("/alltracks")

    public List<Track> getall()
    {
     return muzixRepository.findAll();
    }

    @PostMapping("/track")
     public  Track addTrack(@RequestBody Track track)
    {
        return this.muzixRepository.insert(new Track(track.getTrackname(),track.getTrackcomments(),track.getTracklisteners()));

    }

    @PutMapping("/update")
    public Track updatetrack(@RequestBody Track track)
    {
        muzixRepository.save(track);
        return  track;
    }

    @DeleteMapping("/track/{id}")
    public  String deleteTrack(@PathVariable String id )
    {
        String s="hi";

        System.out.println(id+"....");
        muzixRepository.deleteById(id);
//        System.out.println(t.getTrackname());
//        while (t!=null)
//        {
//            if(t.getTrackid().equals(id)) {
//                this.muzixRepository.delete(t);
//                s= "deleted";
//                break;
//            }
//            else
//                s="id not found";
//        }
        System.out.println(s+"***");
        return s;

    }

}
