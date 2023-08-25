.class public final synthetic Lcom/daaw/kn5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ey6;


# instance fields
.field public final synthetic a:Lcom/daaw/on5;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/on5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/kn5;->a:Lcom/daaw/on5;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/daaw/kn5;->a:Lcom/daaw/on5;

    check-cast p1, Lorg/json/JSONObject;

    iget-object v1, v0, Lcom/daaw/on5;->c:Ljava/util/Map;

    invoke-static {v1, p1}, Lcom/daaw/yn5;->a(Ljava/util/Map;Lorg/json/JSONObject;)V

    return-object v0
.end method
