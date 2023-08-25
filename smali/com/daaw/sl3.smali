.class public final synthetic Lcom/daaw/sl3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/pl3;


# static fields
.field public static final synthetic a:Lcom/daaw/sl3;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/sl3;

    invoke-direct {v0}, Lcom/daaw/sl3;-><init>()V

    sput-object v0, Lcom/daaw/sl3;->a:Lcom/daaw/sl3;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lorg/json/JSONObject;)Ljava/lang/Object;
    .locals 0

    invoke-static {p1}, Lcom/daaw/ul3;->a(Lorg/json/JSONObject;)Ljava/io/InputStream;

    move-result-object p1

    return-object p1
.end method
