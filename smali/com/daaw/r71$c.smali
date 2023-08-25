.class public Lcom/daaw/r71$c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/r71;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/r71$c;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/daaw/r71$c;->b:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/daaw/r71$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/daaw/r71$c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
