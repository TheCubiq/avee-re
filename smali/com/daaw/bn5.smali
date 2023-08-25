.class public final Lcom/daaw/bn5;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final d:Lcom/daaw/ql3;


# instance fields
.field public final a:Lcom/daaw/pn5;

.field public final b:Lorg/json/JSONObject;

.field public final c:Lcom/daaw/pu3;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/an5;

    invoke-direct {v0}, Lcom/daaw/an5;-><init>()V

    sput-object v0, Lcom/daaw/bn5;->d:Lcom/daaw/ql3;

    return-void
.end method

.method public constructor <init>(Lcom/daaw/pn5;Lorg/json/JSONObject;Lcom/daaw/pu3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/bn5;->a:Lcom/daaw/pn5;

    iput-object p2, p0, Lcom/daaw/bn5;->b:Lorg/json/JSONObject;

    iput-object p3, p0, Lcom/daaw/bn5;->c:Lcom/daaw/pu3;

    return-void
.end method
