package xyz.yoffa.cobathreading.tasks;

import xyz.yoffa.cobathreading.types.Request;
import xyz.yoffa.cobathreading.types.Response;

public interface RequestServer extends Runnable {
    Request getCurrentRequest();

    Response buildResponse();
}
