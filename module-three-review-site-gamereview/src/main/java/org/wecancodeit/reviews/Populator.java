package org.wecancodeit.reviews;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.reviews.pojos.Category;
import org.wecancodeit.reviews.pojos.GameReview;
import org.wecancodeit.reviews.pojos.Hashtag;
import org.wecancodeit.reviews.repos.CategoryRepository;
import org.wecancodeit.reviews.repos.GameReviewRepository;
import org.wecancodeit.reviews.repos.HashtagRepository;

import javax.annotation.Resource;
import java.util.HashSet;

@Component
public class Populator implements CommandLineRunner {

    @Resource
    private GameReviewRepository gameReviewRepo;

    @Resource
    private CategoryRepository categoryRepo;

    @Resource
    private HashtagRepository hashtagRepository;

    @Override
    public void run(String... args) throws Exception {
        Hashtag sportHashtag = new Hashtag("sports");
        Hashtag shooterHashtag = new Hashtag("shooter");
        Hashtag multiplayerHashtag = new Hashtag("multiplayer");
        Hashtag eaHashtag = new Hashtag("ea");
        Hashtag strategyHashtag = new Hashtag("strategy");
        Hashtag rtsHashtag = new Hashtag("rts");
        Hashtag historicalHashtag = new Hashtag("historical");
        Hashtag tooFastHashtag = new Hashtag("tooFast");
        Hashtag shootToKillHashtag = new Hashtag("shootToKill");
        Hashtag massiveMultiplayerHashtag = new Hashtag("massively multiplayer");
        Hashtag openWorldHashtag = new Hashtag("open world");
        Hashtag fantasyHashtag = new Hashtag("fantasy");
        Hashtag difficultHashtag = new Hashtag("difficult");
        Hashtag lootBasedHashtag = new Hashtag("loot based");
        Hashtag actionRpgHashtag = new Hashtag("action RPG");
        Hashtag dungeonCrawlerHashtag = new Hashtag("dungeon crawler");


        hashtagRepository.save(sportHashtag);
        hashtagRepository.save(shooterHashtag);
        hashtagRepository.save(multiplayerHashtag);
        hashtagRepository.save(eaHashtag);
        hashtagRepository.save(strategyHashtag);
        hashtagRepository.save(rtsHashtag);
        hashtagRepository.save(historicalHashtag);
        hashtagRepository.save(tooFastHashtag);
        hashtagRepository.save(shootToKillHashtag);
        hashtagRepository.save(massiveMultiplayerHashtag);
        hashtagRepository.save(openWorldHashtag);
        hashtagRepository.save(fantasyHashtag);
        hashtagRepository.save(difficultHashtag);
        hashtagRepository.save(lootBasedHashtag);
        hashtagRepository.save(actionRpgHashtag);
        hashtagRepository.save(dungeonCrawlerHashtag);

        Category sportsCategory = new Category("Sports");
        Category shootersCategory = new Category("Shooters");
        Category massiveMultiplayerCategory = new Category("Massive Multiplayer");
        Category arpgCategory = new Category("Action RPG");
        Category racingCategory = new Category("Racing");
        Category rtsCategory = new Category("Real Time Strategy");

        categoryRepo.save(sportsCategory);
        categoryRepo.save(shootersCategory);
        categoryRepo.save(massiveMultiplayerCategory);
        categoryRepo.save(arpgCategory);
        categoryRepo.save(racingCategory);
        categoryRepo.save(rtsCategory);

        GameReview fifaReview = new GameReview("FIFA 2021", "PS4, PS5, XboxSeriesX, XboxOne, Switch, PC"
                , "https://media.contentapi.ea.com/content/dam/ea/fifa/fifa-21/next-level/media-hub/common/4k-screenshots/screenshots/fifa-21-next-level-4kscreenshot-anfield.png"
                , "fifa 2021 stadium image", "All Kick, No Hands", "For few years now, FIFA games have become particularly stale, and even though they always improve by adding major headlines like Journey, " +
                "Volta, and the Uefa license do keep slightly shake things up every now and then. In my humble opinion, it feels like the series is caught in a rut. EA or FIFA " +
                "is stack with its ways of doing or presenting these games to the general public, they refuse to move out of the comfort zoon. The only improvement visible is the " +
                "on-pitch gameplay and the movement of the players some of which work out pretty smoothly, but for the most but things have remained largely the same especially these " +
                "last couple of years. \n" +
                "\n" +
                "FIFA 21 feels like perhaps the most unnecessary installment in their history for a while. It’s attempts to make some improvements to the actual football and in particular " +
                "it’s attacking gameplay feels smoother and more enjoyable. Attacking gameplay has benefited more in these new updates. I believe this is because, players have become even more " +
                "faster when it comes to counter attacking and attacking in general. The addition of creative runs in FIFA 21 has also made it more enjoyable. This function new allows you to send " +
                "your player on a run in the direction you want him to run right after you pass the ball. The players seem to be much smarter in FIFA 21 than they did in the last few years, at least when it comes to attacking.", sportsCategory, eaHashtag, multiplayerHashtag, sportHashtag);

        GameReview maddenReview = new GameReview("Madden 2021", "PS4, PS5, XboxSeriesX, XboxOne, Switch, PC",
                "https://media.contentapi.ea.com/content/dam/ea/madden-nfl/madden-nfl-21/media/screenshots/images/2020/05/m21-firstlook-mthomas-release-final-01-apr30-ps04-wm.jpg.adapt.crop16x9.818p.jpg",
                "madden 2021 saints vikings gameplay",
                "More of the same, but still fun.", "Madden is back again with graphical improvements, added animations and a roster update reflecting all of the changes over the off season." +
                " It comes with a detailed story mode and online or offline franchise and GM modes. Madden is due for some major overhauls, and although this game is very similar to previous versions, it is still an enjoyable " +
                "football experience.", sportsCategory, eaHashtag, multiplayerHashtag, sportHashtag);

        GameReview residentEvil4Review = new GameReview("Resident Evil 4", "PS4, PS5, XboxSeriesX, XboxOne, Switch, PC",
                "https://www.residentevil.com/4/_asset/images/story2.jpg", "parasite tentacle ripping off heads", "Horror is back, hurray!", "Resident Evil is back; delivering another satisfying horror experience that is hard to beat. " +
                "The Resident Evil franchise has been the standard bearer for horror shooter games for decades, and this edition doesn't disappoint. It is packed full of scares, fun, and the need to be strategic as you stalk through the game's levels and set pieces. " +
                "Don't miss your chance to play a really great horror shooter.", shootersCategory, shooterHashtag);

        GameReview battlefieldOneReview = new GameReview("Battlefield 1", "PS4, PS5, XboxSeriesX, XboxOne, Switch, PC", "https://th.bing.com/th/id/OIP.A0CvrLaiOTpgiPtqMCGkzgHaEK?w=307&h=180&c=7&o=5&pid=1.7",
                "world war one soldier running through debris", "Completely different than all previous Battlefields.", " Battlefield 1 is the fifteenth installment of the Battlefield franchise and was released in 2016. " +
                "            The game was Available for PC, Xbox One, and PS4. Battlefield 1 took a step back in time and introduced players to war torn Europe and the Middle East during the events of the first World War. Apart from the popular online multiplayer " +
                "            modes that fans are accustomed to, this installment also gives a single player campaign mode that allows players to experience story driven missions as soldiers from different nations. In the online multiplayer, " +
                "            Battlefield 1 has a class system similar to some of their older installments. They also have \"Elite classes\" which spawn in at randomly on the map and provide the player that managed to pick it up with a certain edge over regular classes. " +
                "            Popular game modes from Battlefield 4 such as dominion and conquest return, while new game modes such as war pigeon are introduced to give provide players with different experiences. \n" +
                "            Vehicles are still around but they match the era the players find themselves in, you'll have options ranging from heavy, bulky, and slow moving tanks to horses. Vehicles are treated as classes as well, one for ground vehicles, airplanes, and cavalry." +
                "            Visually the game is stunning, especially with the dynamic weather made possible by the frostbite engine and for those keen on small details, they will find that the sound design is also quite remarkable. Overall," +
                "            this installment may be a shift in what dedicated players have experienced with the Battlefield series but with the amount of effort and dedication that has gone behind this installment it worth a try.\n", shootersCategory, eaHashtag, shooterHashtag, multiplayerHashtag);

        GameReview totalWarNapoleonReview = new GameReview("Total War: Napoleon", "PC", "https://3.bp.blogspot.com/-LUhs-xwLwFY/U-CYRBxA8QI/AAAAAAAADms/6EEHhwFB1yo/s1600/Napoleon+Total+War+Game.jpg",
                "British and French troops engaging in battle with bayonets", "Should've been a DLC", " In telling the story of Napoleon, Creative Assembly created a narrower, more tightly scripted series of three campaigns, four if you count the tutorial." +
                " You have to take the scripted nature of the campaign for granted, if only for the sake of the story telling. It certainly allows the team the chance to let players take on some of the specific challenges and situations faced by Napoleon himself. " +
                "Whether you find yourself drawn into the rivalries of Italian city-states on your march to Vienna, or watch as your corps wither away in the harsh Russian winter, Napoleon is fairly faithful to the historical situation. Even the small minor missions and peripheral generals lend an air of authenticity. " +
                "The downside, of course, is that the campaigns tend to focus the action in the same direction each time you play them. There are small opportunities here and there to diverge from the main avenue of advance but for the most part, if a campaign begins at A and ends at C, you can be sure you'll have to go through B to get there. " +
                "And since the three campaigns are only linked by historical context, your successes or failures in one won't affect the others. Fans of the open-ended, expanding consequences of previous Total War games may feel a bit constrained by this approach but the content overall is still enjoyable, even if it's a bit less flexible.", rtsCategory, strategyHashtag, historicalHashtag, multiplayerHashtag, rtsHashtag);

        GameReview ageOfEmpireThreeReview = new GameReview("Age of Empires III", "PC", "https://upload.wikimedia.org/wikipedia/uk/0/01/Age_of_Empires_III_gameplay.png",
                "British and French troops engaging in battle with bayonets", "The weird brother people forget about", " The game follows much the same freeform base-building flow as the rest of the series: " +
                "plonk down a town centre anywhere you like on a map, build villagers, and scurry around extracting food, wood and coin from the land that you use to build armies, improve your technologies, and wipe out your enemies. ", rtsCategory, strategyHashtag, historicalHashtag, multiplayerHashtag, rtsHashtag);

        GameReview needForSpeedReview = new GameReview("Need 4 Speed", "PS4, PS5, XboxSeriesX, XboxOne, Switch, PC", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRr-5A6RAR1IU6ag7epxTi0ObT5jh_-legGiw&usqp=CAU",
                "Need 4 Speed ad pic", "Best Need for Speed ever", "Need for Speed has improved their engine and systems to make the city and cars feel better than ever, occasionally there are the moments which require suspension of disbelief, and it’s possible for the more misguided elements to build tedium in an otherwise strong entry to the series. " + "This new version of Need for Speed games has improved, and I hope that further refinement will see the series better deliver on its legacy.", racingCategory, tooFastHashtag, eaHashtag, multiplayerHashtag, sportHashtag);

        GameReview grandTheftAutoVReview = new GameReview("Grand Theft Auto V", "PS4, PS5, XboxSeriesX, XboxOne, Switch, PC", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSbhweqU5uuQWTXFZGpHqjaMVwMKuWXIyIrww&usqp=CAU", "CJ on an ATV holding a gun", "Best version ever, too violent but lovely", "Grand theft Auto has always been able to simulate it's audience whenever they bring something new on the market.", shootersCategory, multiplayerHashtag, strategyHashtag, shootToKillHashtag);

        GameReview everQuestReview = new GameReview("EverQuest", "PC",
                "https://i.pinimg.com/originals/df/c9/c3/dfc9c3b62cffe78904085f05616d7930.jpg",
                "EverQuest screenshot of kelethin city",
                "Love At First Sight", "EverQuest holds a special place in my heart. It was the first massive multiplayer game I ever played (at the young age of 13). It also was unlike any other game I had ever played. Never before did I have such a massive open world to explore, full of fun things to do. The real kicker was that it was also full of thousands of other people doing the same thing. " +
                "At it's core, EverQuest is a social game with a rich community. You may be killing monsters and raiding dungeons, but you are doing it with real people; and it is entirely possible to build close friendships and a feeling of family with those people. That is the main reason why the EverQuest experience has never been matched in any other game that I've played. " +
                "\n There is no real direction in EverQuest. You are free to do as you please. Yes, the world is dangerous and venturing too far, too early will result in your death. The brutal nature of the game is one of the things that make it so appealing. There are real consequences to the actions you take. You must lean on the community around you to build groups to gain your levels, or bail you out when you are in trouble. " +
                "This results in a strong community, where people know each other, and reputations are built. You aren't just leveling and questing in a faceless world. \n My personal game ranking will always place EverQuest at the top. It is a game that still thrives over 20 years after it released. I strongly encourage anyone that hasn't played it to pick your race and class and dive in to this magical world. Make friends, get lost, get help, and make a lot of memories."
                , massiveMultiplayerCategory, massiveMultiplayerHashtag, openWorldHashtag, fantasyHashtag, difficultHashtag, lootBasedHashtag);

        GameReview diabloTwoReview = new GameReview("Diablo II", "PC",
                "https://theamazonbasin.com/wiki/images/0/0c/Diablo.png",
                "diablo 2 amazon vs diablo fight",
                "One of the Deepest Action RPGs Ever Made.", "Diablo 2 is a classic Action RPG for the PC. The game has reached voting age, but is still going strong, especially with a remake on the way this fall to breathe new life into it. Diablo 2 is a game with punishing difficulty that will test seasoned gamers. It is endlessly replayable with randomly generated levels and loot to keep you constantly looking for the next great drop.\n" +
                " The experience is equally great playing in single player or multiplayer. As your character completes each difficulty level, the overall game difficulty ramps up significantly to provide a real challenge that you can work months on overcoming. I highly recommend picking up the remake this fall if you have not experienced this game, as there will surely be a large group of new players to team up with."
                , arpgCategory, actionRpgHashtag, difficultHashtag, lootBasedHashtag, dungeonCrawlerHashtag);

        gameReviewRepo.save(fifaReview);
        gameReviewRepo.save(maddenReview);
        gameReviewRepo.save(residentEvil4Review);
        gameReviewRepo.save(battlefieldOneReview);
        gameReviewRepo.save(totalWarNapoleonReview);
        gameReviewRepo.save(ageOfEmpireThreeReview);
        gameReviewRepo.save(needForSpeedReview);
        gameReviewRepo.save(grandTheftAutoVReview);
        gameReviewRepo.save(everQuestReview);
        gameReviewRepo.save(diabloTwoReview);
    }

}
