.class public final synthetic Lcom/daaw/uk5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/pl3;


# static fields
.field public static final synthetic a:Lcom/daaw/uk5;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/uk5;

    invoke-direct {v0}, Lcom/daaw/uk5;-><init>()V

    sput-object v0, Lcom/daaw/uk5;->a:Lcom/daaw/uk5;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lorg/json/JSONObject;)Ljava/lang/Object;
    .locals 1

    new-instance v0, Lcom/daaw/pu3;

    invoke-direct {v0, p1}, Lcom/daaw/pu3;-><init>(Lorg/json/JSONObject;)V

    return-object v0
.end method
