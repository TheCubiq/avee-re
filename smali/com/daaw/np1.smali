.class public Lcom/daaw/np1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/cn1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/daaw/cn1<",
        "TT;>;"
    }
.end annotation


# static fields
.field public static final a:Lcom/daaw/cn1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/cn1<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/np1;

    invoke-direct {v0}, Lcom/daaw/np1;-><init>()V

    sput-object v0, Lcom/daaw/np1;->a:Lcom/daaw/cn1;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b()Lcom/daaw/np1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/daaw/np1<",
            "TT;>;"
        }
    .end annotation

    sget-object v0, Lcom/daaw/np1;->a:Lcom/daaw/cn1;

    check-cast v0, Lcom/daaw/np1;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/daaw/z41;II)Lcom/daaw/z41;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/z41<",
            "TT;>;II)",
            "Lcom/daaw/z41<",
            "TT;>;"
        }
    .end annotation

    return-object p1
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method
