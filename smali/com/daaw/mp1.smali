.class public Lcom/daaw/mp1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/i51;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Z:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/daaw/i51<",
        "TZ;TZ;>;"
    }
.end annotation


# static fields
.field public static final a:Lcom/daaw/mp1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/mp1<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/mp1;

    invoke-direct {v0}, Lcom/daaw/mp1;-><init>()V

    sput-object v0, Lcom/daaw/mp1;->a:Lcom/daaw/mp1;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b()Lcom/daaw/i51;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Z:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/daaw/i51<",
            "TZ;TZ;>;"
        }
    .end annotation

    sget-object v0, Lcom/daaw/mp1;->a:Lcom/daaw/mp1;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/daaw/z41;)Lcom/daaw/z41;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/z41<",
            "TZ;>;)",
            "Lcom/daaw/z41<",
            "TZ;>;"
        }
    .end annotation

    return-object p1
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method
