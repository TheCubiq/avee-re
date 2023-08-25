.class public final Lcom/daaw/a30$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/a30$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/a30;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public final a:[Lcom/daaw/a30$d;


# direct methods
.method public constructor <init>([Lcom/daaw/a30$d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/a30$c;->a:[Lcom/daaw/a30$d;

    return-void
.end method


# virtual methods
.method public a()[Lcom/daaw/a30$d;
    .locals 1

    iget-object v0, p0, Lcom/daaw/a30$c;->a:[Lcom/daaw/a30$d;

    return-object v0
.end method
