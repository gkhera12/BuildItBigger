package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Jokes {
    private static List<String> gitJokes = Arrays.asList("git pull a day keeps the conflict's away\n" ,
            "If you have anything staged, commit now or stash forever\n" ,
            "git-hg: Don't you know that's poison?\n" ,
            "git stash drop: Hey! That stuff's expensive.\n" ,
            "Remember to keep your porcelain clean\n" ,
            "git-fetch: no training required\n" ,
            "Commit early, commit often. A tip for version controlling - not for relationships\n" ,
            "Fork by yourself, shame on you. Fork with a friend, now we're getting somewhere.\n" ,
            "A branch, a tag, and a reflog walk into a bar. The bartender says, \"What is this, some sort of rebase?\"\n" ,
            "Why did the commit cross the rebase? To git to the other repo\n" ,
            "You can checkout any time you like, but you can never diff.\n" ,
            "git-sweep: It's brooms, all the way down.\n" ,
            "I kissed a git, and I liked it. I hope my repo don't mind it.\n" ,
            "The git that keeps on giving.\n" ,
            "git-svn: now you have two problems.\n" ,
            "CVS Survivors Meetings are Tuesdays at 9\n" ,
            "Beware the HEADless horseman of gitty hollow\n" ,
            "Be careful not to step in the git-gui\n" ,
            "Ring around the repo, pockets full of plumbing, objects, objects, we all commit.\n" ,
            "git-nom --omnom: eats all your tasty code\n" ,
            "Gits N' Roses: Now with more git cherry-pop, git freebase, and starring git Slash!\n" ,
            "Nurture your git-twigs and they will grow into a full branch\n" ,
            "Knock knock. Who's there? Git. Git-who? Sorry, 'who' is not a git command - did you mean 'show'?\n" ,
            "We're gits of the round table! | We eat ham and jam and commitalot! | On second thought, let's not go to #gitalot. It is a silly place.\n" ,
            "Be careful when rewriting history. It may push you to use the dark side of the --force\n" ,
            "When you play the game of clones, you merge or you reset --hard.\n" ,
            "git-clone has nothing to do with reproduction. So stop that.\n" ,
            "git: Multiplayer Notepad\n" ,
            "It's big, it's heavy, it's wood! git-log, from BLAMMO!\n" ,
            "Now with more indirect cycling giraffes!\n" ,
            "git-prune: not as tasty as git-cherry, but much better for you\n" ,
            "git-fsck: think of the children\n" ,
            "Keep good care of your git-shell and your inner snail will thank you\n" ,
            "git-daemon: the evil rises\n" ,
            "git-bisect: No, not like that. Grow up.\n" ,
            "git-cherry-pick does not yield actual delicious cherries\n" ,
            "Be careful not to remove the branch you're standing on\n" ,
            "In Soviet Russia, git commits YOU!\n" ,
            "git: Committed for life\n" ,
            "git happens\n" ,
            "We can't stop here, this is git country!\n" ,
            "I bet you thought this was a joke. Nope, git-testa.\n" ,
            "May the forks be with you\n" ,
            "Wait for the git-beats --drop\n" ,
            "git is one byte short of a four-letter word\n" ,
            "Yo dawg we heard you like commits so we put some commits in your tree so you can add submodules while you commit\n" ,
            "What we push in life echoes in eternity\n" ,
            "All those commits will be lost in time... Like tears in rain... Time to gc\n" ,
            "git-bisect: The good, the bad and the... uhh... skip\n" ,
            "git-stash: The sock drawer of version control\n" ,
            "git-filter-branch: Hide your dirty laundry\n" ,
            "git - control your forest of trees\n" ,
            "git - subversion done right\n" ,
            "This is not a joke, it's a commit.\n" ,
            "We're gits on the moon! We format our patches! But there ain't no stashes so we code bad branches and rebase our commits!\n" ,
            "git-cherry: the healthier snack\n" ,
            "Be careful you don't get lost in gitland!\n" ,
            "diff in hell, SVNites!\n" ,
            "gitcoin: REWRITE A COMMIT, GO TO JAIL\n" ,
            "git off!\n" ,
            "War is peace, freedom is slavery, ignorance is strength, git is version control");

    public static String jokeTeller(){
        Random random = new Random();
        int number = random.nextInt(61);
        String joke = gitJokes.get(number);
        return joke;
    }
}
