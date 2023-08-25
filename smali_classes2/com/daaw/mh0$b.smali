.class public final Lcom/daaw/mh0$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/nl$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/mh0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/nl$c<",
        "Lcom/daaw/mh0;",
        ">;"
    }
.end annotation


# static fields
.field public static final synthetic p:Lcom/daaw/mh0$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/mh0$b;

    invoke-direct {v0}, Lcom/daaw/mh0$b;-><init>()V

    sput-object v0, Lcom/daaw/mh0$b;->p:Lcom/daaw/mh0$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
