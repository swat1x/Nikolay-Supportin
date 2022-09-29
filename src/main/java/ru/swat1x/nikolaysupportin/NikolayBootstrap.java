package ru.swat1x.nikolaysupportin;

import lombok.extern.log4j.Log4j2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Log4j2
public class NikolayBootstrap {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        NikolaySupportin nikolay = new NikolaySupportin("MTAyNTA2NzMwMjAxMTU1MTg5NA.G1ZPX1.OdDP018vwD1ApmArXglMli22Nf7e6dj2uSzBtM");
        long startTime = System.currentTimeMillis() - start;
        log.info("Nikolay started in {} ms", startTime);
        System.out.println("started in " + startTime + " ms");
    }

}
